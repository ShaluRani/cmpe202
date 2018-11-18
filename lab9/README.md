Summary:

Strategy pattern has been considered for illustration of this lab. The scenario comprises of two phone number entries(US number and UK number) and based on the extension, it is decided if the USPhone number strategy will be implemented or UK Phone number strategy.

The regular implementation consists of a PhoneContext class, which assigns the strategy to be used. An interface PhoneNumStrategy defines a display method and the classes USPhoneNum and UKPhoneNum implements PhonenumStrategy.
The code in this case is quite elaborated.
On the other hand, by using lambda, the code looks more concise and clean. Lambda is convenient to use and eliminates the additional classes created as part of regular implementation. It only required the Main class and the interface PhoneNumStrategy in the current scenario.
