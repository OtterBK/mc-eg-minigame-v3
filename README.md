

<div align=center>
  
![EG-SKY-로고만](https://user-images.githubusercontent.com/28488288/110087719-5906f180-7dd7-11eb-93da-f3c4929af002.png)
![eg로고](https://user-images.githubusercontent.com/28488288/110087696-50aeb680-7dd7-11eb-9bd8-5a840c32e961.jpg)


</div>
<br>

## 🕹 EG MINIGAME 시즌3
#### EG MINIGAME 서버 시즌3의 미니게임 플러그인
> PC 게임 마인크래프트의 사설 서버에서 사용 가능합니다.  
> 해당 플러그인은 마인크래프트 1.12.2  버전, spigot에서의 사용을 권장합니다.

<br>

___
#### 📚 개요
> 마인크래프트 사설 서버 EG MINIGAME의 미니게임 플러그인입니다.
자유롭게 수정하여 사용해주세요. 
기존 EG MINIGAME 시즌2의 플러그인을 대폭 수정하여 최적화와 유지보수에 신경썼습니다.

<br>

#### 📄 미니게임 목록

``` 
 * 살인자를 찾아라 ✨
 * 히어로즈워 ✨
 * 미니 신들의 전쟁 ✨
 * 파쿠르 레이상 ✨
 * 랜덤 무기 전쟁(배틀로얄) ✨
 * 광물의 왕
 * 모루 피하기
 * 데스런
 * 선빵게임
 * 스플리프
 * 자리뺏기
 * 폭탄돌리기
 * 컬러매치
 * 빌드 컨테스트


✨ 는 인기 있던 게임을 표시했습니다.
```
---
#### 🛠 플러그인 구성

<div align=center>
  
![구조](https://user-images.githubusercontent.com/28488288/110091389-bb61f100-7ddb-11eb-8d90-0ab905094632.png)

`주황색 네모박스는 미구현된 것들입니다.`

</div>

##### 기존 EG MINIGAME 시즌2 플러그인과는 달리 한개의 플러그인으로 작동합니다.
 대부분의 필수 기능을 구현하였기 때문에 해당 플러그인과 API만으로 서버 구축이 가능합니다.


---
#### 🔗 미니게임 설정
  
  ##### 각 미니게임 시스템마다 
```
- 강제 시작
- 강제 종료
- 게임 설정
- 게임 참여
- 게임 퇴장
```
##### 위의 기능을 포함하는 명령어가 존재합니다.  해당 명령어를 사용하세요. <br> 💡 `소스코드 확인` 

##### 명령어 예시
> EGServer/EGServer.class 는 플러그인의 메인 시스템 부분으로 onEnable() 메서드에서 미니게임을 초기화합니다. 아래 구문은 미니게임 중 살인자를 찾아라를 추가하는 부분입니다.
```
findTheMurder = new FindTheMurder(server, "FindTheMurder", "§c§l살인자를 찾아라 §f§l1채널§7", "/ftm1");
```

##### 모든 미니게임은 Minigames/Minigame.class 를 상속받으며 생성시 <br> (Plugin server, String 데이터폴더명, String 게임이름, String 명령어접두사) 를 요구합니다. <br> 따라서 예시의 '/ftm1' 가 미니게임의 명령어가 됩니다.

#### 🎲 채널 추가
> Minigames/Minigame.class 를 사용해 생성한 미니게임은 채널을 원하는만큼 추가할 수 있습니다.
##### 예시

```
kingOfMine1 = new KingOfMine(server, "KingOfMine1", "§c§l광물의 왕 §f§l1채널§7", "/kom1"); //1채널 생성
minigames.add(kingOfMine1); //미니게임 목록에 추가

kingOfMine2 = new KingOfMine(server, "KingOfMine2", "§c§l광물의 왕 §f§l2채널§7", "/kom2"); //2채널 생성
minigames.add(kingOfMine2);
		
kingOfMine3 = new KingOfMine(server, "KingOfMine3", "§c§l광물의 왕 §f§l3채널§7", "/kom3"); //3채널 생성
minigames.add(kingOfMine3);
		
kingOfMine4 = new KingOfMine(server, "KingOfMine4", "§c§l광물의 왕 §f§l4채널§7", "/kom4"); //4채널 생성
minigames.add(kingOfMine4);
```

<br>

---

####  📥 플러그인 다운로드
<div align=center>

👉 [구글 드라이브](https://drive.google.com/file/d/1KkbhNT1meqZ2XSW1cmxlt8AlexZdENS8/view?usp=sharing)

</div>

---

#### 📹 미니게임 플레이 영상
> EG 를 플레이해주신 유저분들의 플레이 영상입니다.

[![유튜브](http://img.youtube.com/vi/EaRlog-2PtM/0.jpg)](https://youtu.be/EaRlog-2PtM?t=0s) 

[![유튜브](http://img.youtube.com/vi/Qw2etWwAYgw/0.jpg)](https://youtu.be/Qw2etWwAYgw?t=0s) 

[![유튜브](http://img.youtube.com/vi/sWwI_g_c4ps/0.jpg)](https://youtu.be/sWwI_g_c4ps?t=0s) 

[![유튜브](http://img.youtube.com/vi/0FJw6GEjsaY/0.jpg)](https://youtu.be/0FJw6GEjsaY?t=0s) 

[![유튜브](http://img.youtube.com/vi/0b237Z86A1Y/0.jpg)](https://youtu.be/0b237Z86A1Y?t=0s) 

[![유튜브](http://img.youtube.com/vi/VkmoqxGPQHY/0.jpg)](https://youtu.be/VkmoqxGPQHY?t=0s) 

---
#### 참조 API

ActionbarAPI - https://www.spigotmc.org/resources/actionbarapi-1-8-1-14-2.1315/
BarAPI - https://dev.bukkit.org/projects/bar-api
Citizens - https://dev.bukkit.org/projects/citizens
CorpseReborn - https://www.spigotmc.org/resources/corpsereborn.29875/
EffectLib - https://dev.bukkit.org/projects/effectlib
Holographic Display - https://dev.bukkit.org/projects/holographic-displays
NameTagEdit - https://www.spigotmc.org/resources/nametagedit.3836/
NoteBlockAPI - https://www.spigotmc.org/resources/noteblockapi.19287/
PlaceHolderAPI - https://www.spigotmc.org/resources/placeholderapi.6245/
ProtocolLib - https://www.spigotmc.org/resources/protocollib.1997/
TitleAPI - https://www.spigotmc.org/resources/titleapi-1-8-1-14-2.1325/
##### 서버 버킷 - Spigot 1.12.2 버킷
---
## 📬 연락 방법 (Contact)
이 프로젝트에 대해 질문이 있거나, 개선 아이디어를 공유하고 싶다면 언제든지 연락해주세요!  
(Feel free to reach out if you have questions or ideas for improvement!)

- **Discord**: bokum_
- **Email**: [otter6975@gmail.com](mailto:otter6975@gmail.com)
