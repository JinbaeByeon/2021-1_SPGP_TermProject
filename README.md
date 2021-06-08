# 2015182013 변진배
## **2021-1 SPGP TermProject** - 스마트폰 게임 프로그래밍 텀 프로젝트

### 게임 소개
- 위로 진행하는 종 스크롤 탄막 슈팅게임
- 시작 시 플레이어 기체를 선택한 후, 일반 몬스터와 보스 몬스터를 잡는 것을 반복적으로 진행
- 몬스터는 스테이지가 진행될 수록 점점 강력해짐
  
---------------------------------------------------------------------------------------------------------------

### 개발 계획/일정/실제 진행

주차 | 내용 | 완성도 | 비고
:-----: | :-----: | :-----: | :-----:
1주차 | 리소스 수집 |100% | -
2주차 | 프레임워크 개발 | 100% | -
3주차 | 플레이어 공격 구현 | 100% | 파워에 따른 총알 업그레이드 적용
4주차 | 플레이어 이동 구현 | 100% | 부드러운 이동 적용
5주차 | 적 유닛 이동 및 공격 구현 | 100% | 보스 2개체 패턴 3가지 적용 
6주차 | 아이템 및 충돌처리 구현 | 100% | 코인, 파워, 체력, 폭탄 적용
7주차 | 시작 UI 구현 | 100% | 플레이어 4 종류 선택 가능
8주차 | 사운드 구현 | 100%  | BGM, 적 피격, 적 파괴 사운드 적용
9주차 | 버그 수정 | 100% | -

#### commit log

주차 | 횟수| 깃허브 로그
:-----: | :-----:| :-----:|
1주차 | 3 | ![image](https://user-images.githubusercontent.com/22373033/121112094-e892c500-c84a-11eb-8285-9986a709f89b.png)
2주차 | 5 | ![image](https://user-images.githubusercontent.com/22373033/121112139-f8120e00-c84a-11eb-8cc2-2fab1d70eb66.png)
3주차 | 2 | ![image](https://user-images.githubusercontent.com/22373033/121112165-ffd1b280-c84a-11eb-8e60-833dc25f271c.png)
4주차 | 0 | -
5주차 | 3 | ![image](https://user-images.githubusercontent.com/22373033/121112186-0829ed80-c84b-11eb-9d1c-ae3a42c00d2c.png)
6주차 | 12 | ![image](https://user-images.githubusercontent.com/22373033/121112245-1d9f1780-c84b-11eb-9ba5-ab2cb11c0c5f.png)
7주차 | 7 | ![image](https://user-images.githubusercontent.com/22373033/121112264-24c62580-c84b-11eb-894f-159ab7ef31ab.png)
8주차 | 10 | ![image](https://user-images.githubusercontent.com/22373033/121112306-314a7e00-c84b-11eb-919b-7cf9bf39248a.png)
9주차 | 3 | ![image](https://user-images.githubusercontent.com/22373033/121112338-3a3b4f80-c84b-11eb-8d7b-3b796679db07.png)
10주차 | 3 | ![image](https://user-images.githubusercontent.com/22373033/121112360-40c9c700-c84b-11eb-916b-9592735533c7.png)
합계 | 48 | 



---------------------------------------------------------------------------------------------------------------
### 게임 설명

1.시작화면에서 비행기 선택

![image](https://user-images.githubusercontent.com/22373033/121117309-e3397880-c852-11eb-9909-932d38f03c8f.png)


2. 인게임
- 일반 몬스터 

![image](https://user-images.githubusercontent.com/22373033/121117748-a1f59880-c853-11eb-947f-b39c66cfe252.png)


- 보스

![image](https://user-images.githubusercontent.com/22373033/121117901-dff2bc80-c853-11eb-9d2a-ce577117840a.png)


(좌측 상단에는 플레이어 체력바, 우측 하단에는 폭탄 버튼이 존재하며 그 위에 있는 폭탄 아이콘은 플레이어가 갖고 있는 폭탄의 양을 나타낸다)


3. 엔딩씬

![image](https://user-images.githubusercontent.com/22373033/121118397-bc7c4180-c854-11eb-907e-a7eae030b0ff.png)

(재시작 시 시작화면으로, 종료 시 게임 종료)

---------------------------------------------------------------------------------------------------------------
### 사용된 기술


#### 참고한 것들
 - BGSound.java 클래스에서 MediaPlayer 클래스를 이용한 부분은 안드로이드 스튜디오 사이트에서 참고함

#### 수업내용에서 차용한 것
 - 기본 프레임워크는 수업내용 중 DragonFlight를 차용함

#### 직접 개발한 것
 - 기존 플레이어 이동은 좌우 한정이었기 때문에 터치 후 이동을 따로 구현하였고, 부드러운 이동을 위해 손가락이 이동한 거리를 한번에 이동하지 않고 일정 시간에 걸쳐서 이동하도록 구현
 - 플레이어의 좌우 이동에 따라 index값을 조정하여 기체의 기울기를 구현
 - 생성되는 총알의 power 값에 따라 index 값을 조정하여 플레이어의 power에 따라 변하는 총알을 구현
 - 그 외 아이템, 체력바 ui, 버튼, 몬스터 및 보스 패턴 등 구현
 - 씬의 분리는 수업내용으로 나가기 전에 기존에 구현했던 코드 적용



### 아쉬운 점
- 알맞는 사운드 리소스가 없을 경우 이미지 리소스처럼 제작하기가 힘들어서 사운드를 많이 적용하지 못한 부분이 아쉽다.
- 시간의 여유가 있었으면 일반 몬스터의 패턴을 다양하게 만들어보았을텐데 패턴이 단순한 것이 아쉽다.
- 플레이어 종류별 HighScore를 기록하고 서버와 연동하도록 구현한다면 좋았을 것 같다.


---------------------------------------------------------------------------------------------------------------
### [게임 시연 Youtube Link](https://youtu.be/f231ut60-DY "2021-1 SPGP TermProject 시연 영상")
