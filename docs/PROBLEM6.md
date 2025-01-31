## 🚀 기능 요구 사항

우아한테크코스에서는 교육생(이하 크루) 간 소통 시 닉네임을 사용한다. 간혹 비슷한 닉네임을 정하는 경우가 있는데, 이러할 경우 소통할 때 혼란을 불러일으킬 수 있다.

혼란을 막기 위해 크루들의 닉네임 중 **같은 글자가 연속적으로 포함** 될 경우 해당 닉네임 사용을 제한하려 한다. 이를 위해 같은 글자가 연속적으로 포함되는 닉네임을 신청한 크루들에게 알려주는 시스템을 만들려고 한다.


신청받은 닉네임 중 **같은 글자가 연속적으로 포함** 되는 닉네임을 작성한 지원자의 이메일 목록을 return 하도록 solution 메서드를 완성하라.

### 제한사항

- 두 글자 이상의 문자가 연속적으로 순서에 맞추어 포함되어 있는 경우 중복으로 간주한다.
- 크루는 1명 이상 10,000명 이하이다.
- 이메일은 이메일 형식에 부합하며, 전체 길이는 11자 이상 20자 미만이다.
- 신청할 수 있는 이메일은 `email.com` 도메인으로만 제한한다.
- 닉네임은 한글만 가능하고 전체 길이는 1자 이상 20자 미만이다.
- result는 이메일에 해당하는 부분의 문자열을 오름차순으로 정렬하고 중복은 제거한다.

### 실행 결과 예시

| forms | result |
| --- | --- |
| [ ["jm@email.com", "제이엠"], ["jason@email.com", "제이슨"], ["woniee@email.com", "워니"], ["mj@email.com", "엠제이"], ["nowm@email.com", "이제엠"] ] | ["jason@email.com", "jm@email.com", "mj@email.com"] |

### 가능 목록

- 닉네임 분리하기
  - 닉네임이 두 글자씩 분리한다. ex) 제이엠 -> 제이, 이엠
  - 분리된 닉네임과 이메일을 키와 값 쌍으로 저장한다.
  - 만약 닉네임이 한 글자인 경우 한 글자 그대로 이메일과 함께 저장한다.

- 중복된 글자가 포함된 닉네임을 가진 크루 선별하기
  - 분리된 닉네임을 가진 이메일 목록을 탐색한다.
  - 만약 동일한 분리된 닉네임을 포함하는 경우(분리된 닉네임이 가지고 있는 이메일의 수가 2개 이상일 경우) 알림을 보낼 이메일 목록에 추가한다.
  - 알림을 보낼 이메일 목록에 중복을 제거한다.

- 결과 도출하기
  - 선별된 이메일을 오름차순으로 정렬 후 반환한다.