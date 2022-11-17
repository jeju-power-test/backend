package com.goorm.jejuPowerTest.app.place.service;

import com.goorm.jejuPowerTest.app.place.dto.CreatePlaceDTO;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import com.goorm.jejuPowerTest.app.place.entity.Place;
import com.goorm.jejuPowerTest.app.place.respository.PlaceRepository;
import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
import com.goorm.jejuPowerTest.global.mapper.PlaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PlaceService {

    private final PlaceRepository placeRepository;

    private final PlaceMapper placeMapper;

    @Transactional
    public void create(CreatePlaceDTO createPlaceDTO){
        Place place = placeMapper.dtoToEntity(createPlaceDTO);
        placeRepository.save(place);
    }

    // TODO : 메소드화 시키기
    public List<ResponsePlaceDTO> getAnswer(RequestDTO[] requestDTO, int history, int region, int dialect) {
        List<ResponsePlaceDTO> responsePlaceDTOS = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        String[] name = new String[3];
        int[] cnt = new int[3];
        int placeNum1 = 0;
        int placeNum2 = 0;
        int i = 0;
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
            if(cnt[1] >= 2){
                if(cnt[2] >= 2){
                    placeNum1 = rand(3, -1);
                    placeNum2 = rand(3, placeNum1);
                    Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                    ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                    Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                    ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                    responsePlaceDTOS.add(placeDTO1);
                    responsePlaceDTOS.add(placeDTO2);
                    return responsePlaceDTOS;
                }
                else if(cnt[2] <= 1){
                    placeNum1 = 2;
                    placeNum2 = rand(3, placeNum1);
                    Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                    ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                    Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                    ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                    responsePlaceDTOS.add(placeDTO1);
                    responsePlaceDTOS.add(placeDTO2);
                    return responsePlaceDTOS;
                }
            }
            else if(cnt[1] <= 1){
                placeNum1 = 1;
                placeNum2 = 2;
                Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                responsePlaceDTOS.add(placeDTO1);
                responsePlaceDTOS.add(placeDTO2);
                return responsePlaceDTOS;
            }
        }
        else if(cnt[0] == 2){
            if(cnt[1] == 2){
                if(cnt[2] == 2){
                    placeNum1 = rand(3, -1);
                    placeNum2 = rand(3, placeNum1);
                    Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                    ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                    Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                    ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                    responsePlaceDTOS.add(placeDTO1);
                    responsePlaceDTOS.add(placeDTO2);
                    return responsePlaceDTOS;
                }
                else if(cnt[2] <= 1){
                    placeNum1 = 2;
                    placeNum2 = rand(3, placeNum1);
                    Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                    ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                    Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                    ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                    responsePlaceDTOS.add(placeDTO1);
                    responsePlaceDTOS.add(placeDTO2);
                    return responsePlaceDTOS;
                }
            }
            else if(cnt[1] <= 1){
                placeNum1 = 1;
                placeNum2 = 2;
                Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                responsePlaceDTOS.add(placeDTO1);
                responsePlaceDTOS.add(placeDTO2);
                return responsePlaceDTOS;
            }
            else {
                placeNum1 = rand(3, -1);
                placeNum2 = rand(3, placeNum1);
                Place place1 = placeRepository.findByCategory(name[placeNum1]).get();
                ResponsePlaceDTO placeDTO1 = placeMapper.entityToDto(place1);
                Place place2 = placeRepository.findByCategory(name[placeNum2]).get();
                ResponsePlaceDTO placeDTO2 = placeMapper.entityToDto(place2);
                responsePlaceDTOS.add(placeDTO1);
                responsePlaceDTOS.add(placeDTO2);
                return responsePlaceDTOS;
            }
        }
        return responsePlaceDTOS;
    }
    public int rand(int num, int except){
        int temp = -1;
        while (true){
            temp = (int) (Math.random()*num);
            if(temp != except){
                break;
            }
        }
        return temp;
    }
}
