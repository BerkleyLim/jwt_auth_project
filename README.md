# jwt_auth_project
- JWT 활용을 로그인을 구현하고, 사용자 권한별 메뉴 부여
- 프론트엔드 : React.js, Tailwind css, MobX, JWT Client
- 백엔드 : Java spring boot, JWT Server, GraphQL

# 목적
- 프론트엔드 : React 기반으로 bootstrap에서 Tailwind css로 대처하고, mobX 사용하기 위해 진행
- 백엔드 : 자신 있는 스택 기준으로 JWT를 완전 정복하고, GraphQL을 적용
- 기타 : 각 사용자별 FCM 기능을 수행하기 위해 SSE 기능이 탑재된 프로그램 제작

# 설명
- 로그인, 회원 가입 기능 구현, 이후 각 사용자별 사용할 수 있는 권한 부여
- Front
  - 첫번째 페이지 : 로그인 화면 띄우고 회원가입 기능 탑재
  - 두번째 페이지 : 회원 가입 폼 구현
  - 세번째 페이지 : 로그인 성공 이후, 로그인 이후 보유한 권한별로 각 권한에 알맞게 메뉴창 뿌리기
  - 네번째 페이지 : 회원 정보 리스트 출력 (admin: 전체 부서를 조회 및 권한 부여 가능 회원 삭제 가능 회원 추가 가능, supervisor : 해당 부서만 읽기 및 수정, 삭제 권한 부여, reader : 숨기기, writer : 숨기기)
  - 다섯번째 페이지 : 게시판 리스트 및 상세보기 (admin: 전체 부서 화면 출력 가능하고, 마음대로 수정 또한 가능, supervisor : 전체 부서 화면 조회 가능 선택, 본인 부서만 조회 및 각 부서별 올린 글 임의 수정 가능, reader : 해당 부서만 읽기 가능, writer : 해당 부서만 읽기 가능하며 본인 글만 수정 및 삭제 가능)

- Back
  - JWT 인증을 통해 회원 정보가 존재하는지, 혹은 존재하지 않는지 구별 짓는다.
  - 사용자 권한유형 : admin, supervisor, reader, writer
    - admin : 회원 정보 전체 리스트 볼 수 있게 지정, 모든 권한을 부여한다. (reader, writer, supervisor 선택해야 가능)
    - supervisor : 부서별만 권한 설정 가능, 전체 부서는 볼수 있는 것은 제한함 (reader, writer 선택해야 부여 가능)
    - reader : 기본적으로 선택해야 하는 권한 부여, 권한이 없으면 로그인 자체 차단
    - writer : 글쓰기 권한 부여
   
  - FCM 기능을 통해 알림 리스트
    - 로그인 시 FCM 전송
    - 타인이 글을 남기면 업로드 FCM 구현
    - (관리자) 회원 가입시 FCM 전송
   
# 파급 효과
- 보안 및 인증에 대해 구현 방법의 대해 알 수 있다.
- JWT 활용하는 방법에 대해 한층 익히고, FCM을 스스로 구현이 가능하다.


# 참조
- React+TS+MobX 설정 : https://slog.website/post/3