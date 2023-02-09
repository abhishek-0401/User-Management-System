# User Management System
#### User Management System provides us an opportunity to GET the list of all the users stored in an ArrayList. We can also add a new user, update the information of an already existing user and deleting any user by it's userId as per our requirement.

#### Tools used:
-  JDK 17
-  Intelij IDEA
#### Dependencies used:
-  Spring Web
-  Spring Boot Dev Tools

## 📄 API Documentation
> http://localhost:8080/api/v1/user-app
#### Each user will have the following attributes:
- UserId
- Name
- UserName
- Address
- Phone Number

#### End Points used:
> - /getaAllUser
> - /getUser/userid/{userid}
> - /updateUserInfo/id/{id}
> - /addUser
> - /deleteUser/id/{id}

- ## Get all Users list

```rs
GET http://localhost:8080/api/v1/user-app/getAllUser
```
```json
[
  {
    "id": 1,
    "name": "Abhishek",
    "username": "abhi0401",
    "address": "Jammu",
    "phoneNumber": 9415745621
  },
  {
    "id": 2,
    "name": "Shivam",
    "username": "shiva22",
    "address": "Himachal",
    "phoneNumber": 7885456210
  },
  {
    "id": 3,
    "name": "Sahil",
    "username": "sahil871",
    "address": "Srinagar",
    "phoneNumber": 6005745461
  },
  {
    "id": 4,
    "name": "Arti",
    "username": "arti_devi",
    "address": "Rajbagh",
    "phoneNumber": 9784514784
  },
  {
    "id": 5,
    "name": "Sumit",
    "username": "sumo_112",
    "address": "Punjab",
    "phoneNumber": 8716024532
  }
]
```
![](/screenshots/SnapShot1_GetAllUsers.jpg)
- ## Get a user by it's userId

```rs
GET http://localhost:8080/api/v1/user-app/getUser/userid/{userid}
```
#### 🎯 Examples
```
http://localhost:8080/api/v1/user-app/getUser/userid/1
```
![](/screenshots/SnapShot2_GetUserById.jpg)
```json
{
  "id": 1,
  "name": "Abhishek",
  "username": "abhi0401",
  "address": "Jammu",
  "phoneNumber": 9415745621
}
```

```
http://localhost:8080/api/v1/user-app/getUser/userid/4
```
```json
{
  "id": 4,
  "name": "Arti",
  "username": "arti_devi",
  "address": "Rajbagh",
  "phoneNumber": 9784514784
}
```
- ##  Update a user Info
```rs
PUT http://localhost:8080/api/v1/user-app/updateUserInfo/id/{id}
```
Each endpoint can be supplemented by a path containing userId whose info we want to change.
#### 🎯 Example
```
http://localhost:8080/api/v1/user-app/updateUserInfo/id/4
```
![](/screenshots/SnapShot4_updateUserInfo.jpg)
> Status 200 OK
```rs
GET http://localhost:8080/api/v1/user-app/getUser/userid/4
```
```json
{
  "id": 4,
  "name": "Arti",
  "username": "devi_arti",
  "address": "Chandigarh",
  "phoneNumber": 9784514784
}
```
We can observe that the information of user with userId=4 has been updated as it's username and address are changed.

- ##  Add a new user
```rs
POST http://localhost:8080/api/v1/user-app/addUser
```
![](/screenshots/SnapShot3_addUser.jpg)
> Status 200 OK
```
http://localhost:8080/api/v1/user-app/getAllUser
```
```json
[
  {
    "id": 1,
    "name": "Abhishek",
    "username": "abhi0401",
    "address": "Jammu",
    "phoneNumber": 9415745621
  },
  {
    "id": 2,
    "name": "Shivam",
    "username": "shiva22",
    "address": "Himachal",
    "phoneNumber": 7885456210
  },
  {
    "id": 3,
    "name": "Sahil",
    "username": "sahil871",
    "address": "Srinagar",
    "phoneNumber": 6005745461
  },
  {
    "id": 4,
    "name": "Arti",
    "username": "arti_devi",
    "address": "Rajbagh",
    "phoneNumber": 9784514784
  },
  {
    "id": 5,
    "name": "Sumit",
    "username": "sumo_112",
    "address": "Punjab",
    "phoneNumber": 8716024532
  },
  {
  "id": 6,
  "name": "Keshav",
  "username": "keshu_veer",
  "address": "Jamshedpur",
  "phoneNumber": 9458765518
  }
]
```
- ## Delete an already existing user
```rs
DELETE http://localhost:8080/api/v1/user-app/deleteUser/id/{id}
```
#### 🎯 Example
```
http://localhost:8080/api/v1/user-app/deleteUser/id/3
```
![](/screenshots/SnapShot5_deleteUser.jpg)
> Status 200 OK
```
http://localhost:8080/api/v1/user-app/getAllUser
```
```json
[
  {
    "id": 1,
    "name": "Abhishek",
    "username": "abhi0401",
    "address": "Jammu",
    "phoneNumber": 9415745621
  },
  {
    "id": 2,
    "name": "Shivam",
    "username": "shiva22",
    "address": "Himachal",
    "phoneNumber": 7885456210
  },
  {
    "id": 4,
    "name": "Arti",
    "username": "arti_devi",
    "address": "Rajbagh",
    "phoneNumber": 9784514784
  },
  {
    "id": 5,
    "name": "Sumit",
    "username": "sumo_112",
    "address": "Punjab",
    "phoneNumber": 8716024532
  },
  {
  "id": 6,
  "name": "Keshav",
  "username": "keshu_veer",
  "address": "Jamshedpur",
  "phoneNumber": 9458765518
  }
]
```
## Final Updated List
![](/screenshots/SnapShot6_FinalUpdatedList.jpg)
