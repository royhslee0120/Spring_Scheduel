## 프로젝트 소개
일정 관리 기능을 제공하는 spring boot 기반 일정 생성 API입니다.
일정 생성, 조회, 수정, 삭제가 가능합니다.

## 프로젝트 구조 설명

## 1. 📑 API 명세
API 명세는 Postman Collection으로 관리합니다.

### 일정 생성
- POST `/schedules`

### 전체 일정 조회
- GET `/schedules`
- Query Parameter (Optional)
    - authorName

### 일정 수정
- PUT `/schedules/{id}`

### 일정 삭제
- DELETE `/schedules/{id}?password=`


## 2. 🧩 ERD
```mermaid
erDiagram
  SCHEDULE {
    Long id PK
    String title
    String content
    String authorName
    String password
    LocalDateTime createdAt
    LocalDateTime modifiedAt
  }
  ```
  
## 3. 메인 프로젝트 구조
   com.schedule  
   ├─ controller  
   ├─ dto  
   ├─ entity  
   ├─ repository  
   ├─ service  
   └─ ScheduleApplication  
## 4. 사용 언어
   Java  
   Spring  
   MySQL  
   Lombok

## 5. 프로젝트 목표
- `3 Layer Architecture`에 따라 각 Layer의 목적에 맞게 개발해야 합니다.
- CRUD 필수 기능은 모두 데이터베이스 연결 및 `JPA`를 사용해서 개발해야 합니다.
- 일정 작성, 수정, 조회 시 반환 받은 일정 정보에 `비밀번호`는 제외해야 합니다.
- 일정 수정, 삭제 시 선택한 일정의 `비밀번호`와 요청할 때 함께 보낸 `비밀번호`가 일치할 경우에만 가능합니다.