Income: UserVatRequest with different types of PaymentType

Return: Calculated VAT using next formulas:
    
- FOOD: paymentAmount / 10
- FUEL: paymentAmount * 0.02
- ANIMAL_SUPPLY: 0

====================

Add more VAT types:

- ORGANIC_FUEL: 0
- SWEET_DRINKS: paymentAmount * 0.5

* and change AnimalSupply for paymentAmount*0.01

- FOOD_DELIVERY: if amount > 10 VAT is zero, another VAT is fixed 0.01
