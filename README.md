# postmanexample
This is an example of a Java Project

#### Main objective of the application
The main objective of the application is to simulate a postman delivery system.
Each postman works in a different thread and different speeds based on the Vehicle and package size they use.

The amount of time needed until delivery is based on the following math operation:
`Math.round((mail.getSize()*mail.getWeigth())/Vehicle.SPEED_PER_MILE)*1000`

#### Things to improve
- Postman delivers more than one Mail
- Postman communicates with the PostOffice Saying with Mail he delivered
- Crate a network of PostOffices
- Comunicate to a service with Mails have been delivered
- PostOffice knows how many Mails the PostMan delivered
- User can be notified that the package was delivered
- Create confidential mail that only the User can receive

This are just some example of things I could do.

The project is also available for cloning at: https://github.com/emanuelcoelho1986/postmanexample
