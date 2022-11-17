package com.goorm.jejuPowerTest.app.avatar.service;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarFriendDTO;
import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import com.goorm.jejuPowerTest.app.avatar.repository.AvatarRepository;
import com.goorm.jejuPowerTest.global.mapper.AvatarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AvatarService {

    private final AvatarRepository avatarRepository;

    private final AvatarMapper avatarMapper;

    @Transactional
    public void create(CreateAvatarDTO createAvatarDTO){
        Avatar avatar = avatarMapper.dtoToEntity(createAvatarDTO);
        avatarRepository.save(avatar);
    }

    // TODO : 알고리즘 고치기
    public Avatar getAnswer(int history, int region, int dialect) {
        Avatar avatar = null;
        HashMap<String, Integer> map = new HashMap<>();
        String[] name = new String[3];
        int[] cnt = new int[3];
        int i = 0;
        int positive = 0;
        int negative = 0;
        map.put("history", history);
        map.put("region", region);
        map.put("dialect", dialect);
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String, Integer> entry : list){
            name[i] = entry.getKey();
            cnt[i] = entry.getValue();
            System.out.println(i);
            i++;
        }
        if(cnt[0] == 3){
            if(cnt[1] == 3){
                if(cnt[2] >=2){
                    avatar = avatarRepository.findById(7L).get();
                }
                else if(cnt[2] <=1){
                    positive = rand() ? 0 : 1;
                    negative = 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
            }
            else if(cnt[1] == 2){
                if(cnt[2] == 2){
                    avatar = avatarRepository.findById(8L).get();
                }
                else if(cnt[2] <= 1){
                    positive = 0;
                    negative = 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
            }
            else if(cnt[1] == 1){
                if(cnt[2] == 1){
                    positive = 0;
                    negative = rand() ? 1 : 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
                else if(cnt[2] == 0){
                    positive = 0;
                    negative = 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
            }
            else if(cnt[1] == 0){
                positive = 0;
                negative = rand() ? 1 : 2;
                avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
            }
        }
        else if(cnt[0] == 2){
            if(cnt[1] == 2){
                if(cnt[2] == 2){
                    avatar = avatarRepository.findById(8L).get();
                }
                else if(cnt[2] <= 1){
                    positive = rand() ? 0 : 1;
                    negative = 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
            }
            else if(cnt[1] == 1){
                if(cnt[2] == 1){
                    positive = 0;
                    negative = rand() ? 1 : 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
                else{
                    positive = 0;
                    negative = 2;
                    avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
                }
            }
            else if(cnt[1] == 0){
                positive = 0;
                negative = rand() ? 1 : 2;
                avatar = avatarRepository.findByPositiveAndNegative(name[positive], name[negative]).get();
            }
        }
        else if(cnt[0] == 1){
            if(cnt[1] == 1){
                avatar = avatarRepository.findById(9L).get();
            }
            else if(cnt[1] == 0){
                avatar = avatarRepository.findById(10L).get();
            }
        }
        else if(cnt[0] == 0){
            avatar = avatarRepository.findById(10L).get();
        }
        return avatar;
    }

    public boolean rand(){
        int temp = (int) (Math.random()*2);
        return temp == 0 ? true: false;
    }

    public ResponseAvatarDTO getDto(Avatar avatar, int sum) {
        return avatarMapper.entityToDto(avatar, sum);
    }

    public ResponseAvatarFriendDTO getFriend(Long friend) {
        Avatar avatarFriend = avatarRepository.findById(friend).get();
        return avatarMapper.friendEntityToDto(avatarFriend);
    }
}
