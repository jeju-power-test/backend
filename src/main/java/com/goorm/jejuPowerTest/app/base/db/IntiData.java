package com.goorm.jejuPowerTest.app.base.db;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.service.AvatarService;
import com.goorm.jejuPowerTest.app.content.dto.CreatContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import com.goorm.jejuPowerTest.app.place.dto.CreatePlaceDTO;
import com.goorm.jejuPowerTest.app.place.service.PlaceService;
import com.goorm.jejuPowerTest.app.view.entity.View;
import com.goorm.jejuPowerTest.app.view.service.ViewService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntiData {
    private boolean initDataDone = true;
    @Bean
    CommandLineRunner init(
            ContentService contentService, PlaceService placeService, AvatarService avatarService
            , ViewService viewService
    ) {
        return args -> {
            if(initDataDone){
                return;
            }
            // 문제 정답
            CreatContentDTO creatContentDTO1 = new CreatContentDTO("고기 국수", "제주에는 100년 전까지만 해도 밀국수가 없었다. 다만 고려 말 몽골에서 들인 메밀을 익반죽해 짤막한 국수처럼 만들어 먹었다는 메밀칼국수만이 전해온다.\n그러다 1900년대 일제강점기에 ‘건면’이 제주에 들어온다. 고기 국수는 이 건면의 도입과 제주의 전통혼례 풍습이 결합한 새로운 음식으로 100년도 채 안 된 것이다.", "https://kr.object.ncloudstorage.com/jejupower/content/1.png", null);
            CreatContentDTO creatContentDTO2 = new CreatContentDTO("제주해녀항일운동", "제주의 해녀들은 예로부터 수탈과 착취의 대상이었으며 이에 해녀들은 권익보호를 위해 제주도해녀어업조합을 조직하였다.\n그러나 일제는 사건의 조사와 함께 제주도내의 청년운동가들을 대대적으로 검거하기 시작하였으며, 이를 저지하려는 해녀들의 시위가 일어났으나 1월 27일 종달리 해녀들의 시위를 끝으로 일제에 의해 진압되고 말았다.\n이 항일운동은 연인원 17,130명 238회의 집회 및 시위를 전개한 대규모 투쟁으로 제주 3대 항일운동의 하나이다. 또한 우리나라 최대 어민운동이자 1930년대 최대의 항일운동이었다고 할 수 있다.", "https://kr.object.ncloudstorage.com/jejupower/content/2.png", null);
            CreatContentDTO creatContentDTO3 = new CreatContentDTO("4ㆍ3 사건", "1947년 3월 1일을 기점으로 하여 1948년 4월 3일 발생한 소요사태 및 1954년 9월 21일까지 발생한 무력충돌과 진압과정에서 주민들이 희생당한 사건으로 미군정기에 발생하여 대한민국 정부 수립 이후에 이르기까지 7년여에 걸쳐 지속된, 한국현대사에서 한국전쟁 다음으로 인명 피해가 극심했던 비극적인 사건이었다.", "https://kr.object.ncloudstorage.com/jejupower/content/3.png", null);
            CreatContentDTO creatContentDTO4 = new CreatContentDTO("우도", "완만한 경사와 옥토, 풍부한 어장, 우도팔경 등 천혜의 자연조건을 갖춘 관광지로써 한해 약 200만 명의 관광객이 찾는 제주의 대표적인 부속섬이다.\n섬의 길이는 3.8km, 둘레는 17km. 쉬지 않고 걸으면 3~4시간 걸리는 거리지만, 대부분의 관광객은 버스나 자전거, 미니 전기차를 타고 유명한 관광지 위주로 돌아본다.\n검멀레해변이나 우도봉, 홍조단괴해변, 하고수동해변 등 유명한 관광지가 존재한다.\n여유있게 우도를 즐기고 싶다면 오전 아침배를 타고 들어가 오후 배를 타고 나와 하루종일 우도에 머물러 보는것도 좋다. 단, 기상에 따라 배 운항여부가 달라질수 있으니 우도 여행일정을 짜는데는 기상조건을 필히 확인해야한다.", "https://kr.object.ncloudstorage.com/jejupower/content/4.png", null);
            CreatContentDTO creatContentDTO5 = new CreatContentDTO("백록담", "한라산 백록담은 남한에서 가장 높은 산정화구호로 침식에 거의 영향을 받지 않아 순상화산의 원지형이 잘 보존되어 학술 가치가 크고 빼어난 경관을 보여주는 화산지형이다.\n한겨울 쌓인 눈이 여름철까지 남아 있어 녹담만설(鹿潭晩雪)이라는 영주 12경 중의 하나로 자연경관적 가치가 매우 뛰어나다.\n명칭의 유래는 한라산 정상에 백록(흰사슴)이 많이 놀았다 하여 명명되었다고 한다.", "https://kr.object.ncloudstorage.com/jejupower/content/5.png", null);
            CreatContentDTO creatContentDTO6 = new CreatContentDTO("일출봉", "제주 일출봉 해안 일제 동굴진지는 일본군이 연합군 함대를 향해 자살 폭파 공격을 하기 위한 소형선박을 보관하기 위한 격납고로 구축되었다.\n시설 부대와 주둔 부대 등에 대한 기록이 분명하게 남아 있어 일본군 주둔 실상과 침략 야욕을 생생히 보여주고 있다.", "https://kr.object.ncloudstorage.com/jejupower/content/6.png", null);
            CreatContentDTO creatContentDTO7 = new CreatContentDTO("그렇고 말고", "그렇고 말고", null, null);
            CreatContentDTO creatContentDTO8 = new CreatContentDTO("빨리빨리 오세요", "빨리빨리 오세요", null, null);
            CreatContentDTO creatContentDTO9 = new CreatContentDTO("그거 가져다 줘라", "그거 가져다 줘라", null, null);
            CreatContentDTO creatContentDTO10 = new CreatContentDTO("B", "제주특별자치도 캐릭터 “돌이”와 “소리”는 세계자연유산과 화산용암의 상징현무암으로 만들어진 돌하르방이 연상되는 “돌이”와 제주의 해녀 옷을 입고 있는 “소리”의 얼굴 부분을 영문 ‘JEJU’로 표현해 그 상징성을 강조디자인적 차별화 전략으로 다양한 동작 및 의상을 응용 및 개발", "https://kr.object.ncloudstorage.com/jejupower/content/10-A.png", "https://kr.object.ncloudstorage.com/jejupower/content/10-B.png");
            contentService.create(creatContentDTO1);
            contentService.create(creatContentDTO2);
            contentService.create(creatContentDTO3);
            contentService.create(creatContentDTO4);
            contentService.create(creatContentDTO5);
            contentService.create(creatContentDTO6);
            contentService.create(creatContentDTO7);
            contentService.create(creatContentDTO8);
            contentService.create(creatContentDTO9);
            contentService.create(creatContentDTO10);

            // 장소
            CreatePlaceDTO history = new CreatePlaceDTO("제주항일기념관", "제주 역사가 부족한 당신을 위한 당신만의 최태성", "https://www.jeju.go.kr/hangil/index.htm", "https://kr.object.ncloudstorage.com/jejupower/place/history.png", "history");
            CreatePlaceDTO region = new CreatePlaceDTO("제주도 공식 관광정보 포털 “비짓제주”", "제주 여행이 시급한 당신을 위한 당신만의 여행 가이드", "https://www.visitjeju.net/kr", "https://kr.object.ncloudstorage.com/jejupower/place/region.png", "region");
            CreatePlaceDTO dialect = new CreatePlaceDTO("제주특별자치도 홈페이지 “방언 사전”", "육지촌놈인 당신을 위한 당신만의 방언 스승", "https://www.jeju.go.kr/culture/dialect/dictionary.htm", "https://kr.object.ncloudstorage.com/jejupower/place/dialect.png", "dialect");
            placeService.create(history);
            placeService.create(region);
            placeService.create(dialect);

            // 결과 별 유형
            CreateAvatarDTO createAvatarDTO1 = new CreateAvatarDTO("오메기떡", "https://kr.object.ncloudstorage.com/jejupower/avatar/1.png", "history", "dialect", 6L);
            CreateAvatarDTO createAvatarDTO2 = new CreateAvatarDTO("한라봉", "https://kr.object.ncloudstorage.com/jejupower/avatar/2.png", "history", "region", 5L);
            CreateAvatarDTO createAvatarDTO3 = new CreateAvatarDTO("돌하르방", "https://kr.object.ncloudstorage.com/jejupower/avatar/3.png", "region", "dialect", 4L);
            CreateAvatarDTO createAvatarDTO4 = new CreateAvatarDTO("야자수", "https://kr.object.ncloudstorage.com/jejupower/avatar/4.png", "dialect", "region", 3L);
            CreateAvatarDTO createAvatarDTO5 = new CreateAvatarDTO("우도땅콩", "https://kr.object.ncloudstorage.com/jejupower/avatar/5.png", "region", "history", 2L);
            CreateAvatarDTO createAvatarDTO6 = new CreateAvatarDTO("동백꽃", "https://kr.object.ncloudstorage.com/jejupower/avatar/6.png", "dialect", "history", 1L);
            CreateAvatarDTO createAvatarDTO7 = new CreateAvatarDTO("한라산", "https://kr.object.ncloudstorage.com/jejupower/avatar/7.png", null, null, 10L);
            CreateAvatarDTO createAvatarDTO8 = new CreateAvatarDTO("고기 국수", "https://kr.object.ncloudstorage.com/jejupower/avatar/8.png", null, null, 9L);
            CreateAvatarDTO createAvatarDTO9 = new CreateAvatarDTO("흑돼지", "https://kr.object.ncloudstorage.com/jejupower/avatar/9.png", null, null, 8L);
            CreateAvatarDTO createAvatarDTO10 = new CreateAvatarDTO("현무암", "https://kr.object.ncloudstorage.com/jejupower/avatar/10.png", null, null, 7L);
            avatarService.create(createAvatarDTO1);
            avatarService.create(createAvatarDTO2);
            avatarService.create(createAvatarDTO3);
            avatarService.create(createAvatarDTO4);
            avatarService.create(createAvatarDTO5);
            avatarService.create(createAvatarDTO6);
            avatarService.create(createAvatarDTO7);
            avatarService.create(createAvatarDTO8);
            avatarService.create(createAvatarDTO9);
            avatarService.create(createAvatarDTO10);

            // view
            View view = View.builder()
                    .count(161334L)// 161022
                    .build();
            viewService.create(view);
        };
    }
}
