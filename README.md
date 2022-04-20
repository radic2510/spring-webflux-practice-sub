### [Daily] 2차. 2022.04.19

#### [InfoService]

>REST API 로 내부 통신하는 MSA 구축하기

- 1차에서 구축한 서에서 InfoService server 로 내부 호출
- InfoService 는 호출 파라미터로 찾은 데이터의 직업 응답

#### (Spec):
> WebClient

#### (Request):
> GET localhost:8080/hello?name$name

#### (Response):
```
aplication/json
{
  "to": `${name}`,
  “job”: “”,
  "message": `hello ${name}
}
```

#### 결과물
- /job 요청을 받아 정보 리턴