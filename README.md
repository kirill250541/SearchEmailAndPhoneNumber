# searchemailandphonenumber

1.Basic REST service
- Создан и запущен локально простейший веб/REST сервис. 
- Добавлен GET ендпоинт, принимающий входные параметры в качестве queryParams в URL, и возвращающий любой hard-coded результат в виде JSON (найденные Email и телефонные номера).

2.Business logic service
- Добавлен сервис с бизнес логикой согласно варианту, добавлены HttpClient/RegEx.

3.Basic “happy path” functionality
- Добавлен вызов сервиса через REST API.
(http://localhost:8080/Search?text=fsdf375291254456dgfd%20asddfgfgh@gmail.com%20ferasfa%20+375293457788feierfffewfef%20hello.warlda@yellow.com%20jhjg)

Результат:
{
    "email": [
        "asddfgfgh@gmail.com",
        "hello.warlda@yellow.com"
    ],
    "phoneNumber": [
        "375291254456",
        "375293457788"
    ]
}
