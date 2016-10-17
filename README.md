By using this DSL, the domain expert can describe precisely and programmatically the structure of the service. The user could be a
business analyst or a product owner who does not need to know intricate technical details of technology stack that a generated service
is going to be implemented.The domain expert just writes the service structure in the domain language and the DSL creates the skeletal structure of the service which
consists of the all the classes and methods involved in the service. To achieve this, the user has to provide the names of the classes
and methods, the names can be chosen from the domain vocabulary. The DSL, initiates a complete stand-alone service application with
empty classes in it which the developer will implement later. Thus, the domain expert gives the description and functionality of the DSL and the implementation of the logic will be done by the developer. This reduces the communication problems between the domain experts and developers. The name of the proposed DSL is Micro-services DSL, MicsDSL. A service described in MicsDSL generates a service targeting the Play framework. Play framework is a popular open source MVC (Model-View-Controller) framework that is targeted to Java and Scala languages. This service can be started from the command line. Once started it acts as a typical web service, which can be communicated from a web browser. The DSL describes modules of a target service. Each module corresponds to a controller class in Play service application. Controller classes control the data flow between the model and view. It mediates between the model and view classes.                                                                                                                                                                                                                                                                          

For each module, the DSL describes the actions. Each action corresponds to a service end-point. This action translates into Controller's Action methods. Controller actions direct the state of the controller modules.                                                                                                                                                                                                                            

Each action expects input parameters that are given by the "input" methods while the "return" method determines the return type.
For example, if the user wants to describe services for a Library management service, he would describe the service in the manner shown 

```Scala
service("Library") defines "Library service application" at "org.library.dsl" having modules (
  	module("User") defines "User management" having actions (
        	add("user") to "Register a new user" takes (
            input("userName") as "UserName" carries "Member's user name",
            input("password") as "Password" carries "user password",
            input("address") as "Address" carries "user address"
          ) and returns ("User account" as "User"),
        	update("user") to "Modify user account details" takes (
            input("userName") as "UserName" carries "Member's user name",
            input("address") as "Address" carries "Member's new address"
          ) and returns ("Updated user" as "User")
      	),
    	module("Catalog") defines "Books and Magazine catalog management" having 	actions (
        	add("item") to "Add a new catalog item" takes (
            input("item") as "CatalogItem" carries "Catalog item"
          ) and returns ("Catalog item id" as "CatalogItemDetails"),
        	delete("item") to "Remove a catalog item" takes (
            input("itemId") as "CatalogItemId" carries "Catalog item id"
          ) and returns ("Removed catalog item id" as "CatalogItemId")
      	)
)
```
