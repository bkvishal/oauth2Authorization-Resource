# oauth2Authorization-Resource
Sample of Oauth2 Authorization &amp; Resource Serve

This is the example of Oauth2 with Jwt Authorization Serve and Sepearate Resource Server in Spring boot 2.1.6

First Your have to create Authorization Server With jwt token implementation 

In this MicroService your authorization of client will happen here 

actually you have to request to this Authorization Serve for access token with endpoint of http://localhost:8080/oauth/authorize

and pass the username and password of authorization serve this username and password is security of authorization server

and if you are using password grant type you have to pass client and with its secret with it and 

and redirect uri -- which is a callback uri .. this uri will automatically hit which your credentials matched and 

when you redirected in your callback uri you will get access_token attached with your callback uri as a parameter 

and if you use authorization_code grant type than firstly you will get a authorization_code and after then you have to  use 

this code to get access_code by passing this code to oauth/token uri 

you can use postman to test this ..

Signing key of Jwt can be anything of your choice but remember you have to decode at resource serve with the same 

key you used in authorization server ...
