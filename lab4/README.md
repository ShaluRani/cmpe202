Din Tai Fung - CRC Details

The following classes will be created as per the use case:

1. 
Class Name: Reception

Responsibilities: 
Get customer details : Reception will have the customer details such as customer name, cellphone no., party size etc. in order to communicate the availability of table via text message.

Get customer status :  In the event of table availability, customer status will be communicated whether it is confirmed or customer is choosing to leave.

Check table availability : The party size will be passed to the TableChain class and baed on the party size, the table will be assigned.

Tag assigned table to customer : Based on the received customer status, the assigned table is tagged to the current customer. In case current customer's status is "Leave", the next customer in queue is considered which satisfies similar party size requirements.

Notify customers : Customer is notified whenever the table is available.

Collaborators: TableChain, CustomerState

2. Class Name: CustomerState

Responsibilities:
Add customer details: The customer details such as name, cellphone no, party size etc will be set.

Set current status: The current status is defaulted to "Wait". Whenever customer is notified, the state changes based on the sub class implementations.

Collaborator: Reception, Wait, Confirm, Leave

3. Class Name: Wait

Responsibilities: 
Set current status: The current status will be set to "Wait".

Collaborators: CustomerState, Reception

4. Class Name: Confirm

Responsibilities:
Set current status: The current status will be set to "Confirm".

Collaborators: CustomerState, Reception

5. Class Name: Leave

Responsibilities:
Set current status: The current status will be set to "Leave".

Collaborators: CustomerState, Reception

6. Class Name: TableChain

Responsibilities:
Check availability: Subclasses will implement the table availability check based on the party size.
Assign Table: The available table will be assigned by subclasses if part size fulfils the requirement.
Notify Reception: Subclasses will notify reception if table is available.

Collaborators: Reception

7. Class Name: tableForTwo

Responsibilities:
Check availability: Implements the table availability check based on the party size.
Assign Table: The available table will be assigned by if part size fulfils the requirement.
Notify Reception: Will notify reception if table is available.

Collaborators: Reception, TableChain

8. Class Name: tableForFour

Responsibilities:
Check availability: Implements the table availability check based on the party size.
Assign Table: The available table will be assigned by if part size fulfils the requirement.
Notify Reception: Will notify reception if table is available.

Collaborators: Reception, TableChain

9. Class Name: tableForSix

Responsibilities:
Check availability: Implements the table availability check based on the party size.
Assign Table: The available table will be assigned by if part size fulfils the requirement.
Notify Reception: Will notify reception if table is available.

Collaborators: Reception, TableChain


----------------------------------------------------------------------------------------------------------

I have chosen the design patterns: "Chain of Responsibility" and "State"

The chain of responsibility pattern will let the table pass the handlers to any of the table subclasses based on party size. There may be multple table sizes and the clubbing everything together will complicate things, therefore, based on table capacity, different subclasses have been defined.

In the current scenario, Chain of Responsibility pattern is being used to handle the table assignment based on partysize. The handler will be passed from tableForTwo to tableForFour to tableForSix and based on which class addresses it, the output will be returned.


The State design seems applicable for recording customer's current status. By default, if the customer is in line, the status will be "Wait". Once the table availability is confirmed via message from reception, the status will be changed to "Confirm" or "Leave" based on customer's preference.

Based on the situation here, the customer's state is gettting changed here and being handled by the subclasses Wait, Confirm and Leave.


