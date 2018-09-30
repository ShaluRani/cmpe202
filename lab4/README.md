Din Tai Fung - CRC Details

The following classes will be created as per the use case:

1. Class Name: Reception

Responsibilities: 
Get customer details : Reception will have the customer details such as customer name, cellphone no., party size etc. in order to communicate the availability of table via text message.

Assign table : Based on the received customer status, and table notification, table is assigned to the current customer. 

Notify customers : Customer is notified whenever the table is available. It uses the CustStrategy interface to decide which class's object to create i.e. the class with small customer group, medium customer group or large customer group. the implementation is dependent on partsize.

Collaborators: Table, Customer, CustStrategy

2. Class Name: Table

Responsibilities:
Check availability: Table availability check will be done based on the party size sent by reception.
Notify Reception: This method will notify reception if table is available.

Collaborators: Reception

3. Class Name: Customer

Responsibilities:
Add customer details: The customer details such as name, cellphone no, party size etc will be set.

Collaborator: Reception

4. Interface Name: CustStrategy

Responsibilities: 
Send current status: The classes implementing this interface will send message based on customer confirmation/rejection.

Collaborators: Reception

5. Class Name: CustgroupSmall

Responsibilities:
Send current status: The current status will be sent to "Confirm/Leave". The object for this class will only be created if part size is small (for e.g. 2-4)

Collaborators: CustStrategy

6. Class Name: CustgroupMedium

Responsibilities:
Send current status: The current status will be sent to "Confirm/Leave". The object for this class will only be created if part size is of medium size (for e.g. 6-8)

Collaborators: CustStrategy

7. Class Name: CustgroupLarge

Responsibilities:
Send current status: The current status will be sent to "Confirm/Leave". The object for this class will only be created if part size is of large size (for e.g. >8)

Collaborators: CustStrategy


----------------------------------------------------------------------------------------------------------

I have chosen the design patterns: "Observer" and "Strategy"

In real scenario, customer will got to the restaurant and provide details to the reception in case the table is not available. The receptionist will put the current customer in the wait list and manage the queue.

Whenever a table is available with the required customer party size, table will notify the reception/queue manager (considering automatic notification is activated whenever the existing customer pays and exits.)
Observer pattern is being used in this scenario.
Reception is acting as observer and table as the subject.

Now the customer in wait list who is ready to go next will be notified by reception that the table for the mentioned partysize is available. The notification will be based on receptionist's judgement of the partysize. For example if the table for 4 is available and customer1 with partysize 6 and customer2 with partysize 4 are in the queue respectively, notification will go to customer2 with partsize 4 even though customer1 came earlier.
Strategy pattern is being used for this judgement. Based on the table size availability, notifications will be sent.
CustStrategy is the strategy pattern interface and CustgroupSmall, CustgroupMedium and CustgroupLarge are the respective implementations.



