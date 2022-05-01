#Microservice product

##Endpoints

###Save Product : localhost:8080/api/product

```
POST /api/product HTTP/1.1
Host: localhost:8080
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=84E969496DDE1409DB1CD8BE60B8D3E2
Content-Length: 45
{
"name":"test-1",
"price":"1.2"
}
```
### Get All Products: localhost:8080/api/product
````
GET /api/product HTTP/1.1
Host: localhost:8080
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=84E969496DDE1409DB1CD8BE60B8D3E2
Content-Length: 45

{
    "name":"test-1",
    "price":"1.2"
}

````

###Delete Product: localhost:8080/api/product/1
```
DELETE /api/product/1 HTTP/1.1
Host: localhost:8080
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=4D6123EC51A8640F753C557C64348EE3
Content-Length: 45

{
    "name":"test-1",
    "price":"1.2"
}
```

