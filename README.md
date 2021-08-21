# exam-pub Etyka digital job application process

## Cíl projektu: Vytvořit aplikaci simulující  “hospodu”, která simuluje standardní chování v reálném světě. 
 
```1. REST API - partially done
2. Spring framework - no pain no gain
3. Github - duh!
4. Mysql 8.0 - DONE
5. Návrh MVC - done, I guess?
6. Využití angličtiny v db návrhu i v kódu - LOL
7. Basic auth  - TO DO (no idea)
  a. Přihlášení pro uživatele, kteří mohou objednávat  
  b. Účet výčepního, který uvidí jen statistiky
```
Před realizací projektu 
 
1. Založit github repository pod jménem {USER}/exam-pub - obviously DONE
 
Struktura api: 

### 1. GET /users - DONE
```
Vraci vsechny objekty User s atributy: 
a. Id 
b. Name 
c. IsActive 
d. IsAdult 
e. Pocket
```
### 2. GET /users/{id} - partially DONE without implementing orders
```
Vraci User s danym id a jeho objednavky: 
a. Id 
b. Name 
c. IsActive 
d. IsAdult 
e. Pocket 
f. Orders 
 i. Id 
 ii. ProductName 
 iii. Amount 
 iv. Price
```
### 3. GET /drink-menu - DONE
```
Vraci napojovy listek, drinky maji tyto atributy: 
a. Id 
b. ProductName 
c. Price 
d. IsForAdult 
```
### 4. POST /buy - TO DO
```
//Validace zdali je uživatel plnoletý a zdali má dostatek financí v 
peněžence 

  a. UserId 
  b. ProductId 
  c. Price
```  
### 5. GET /summary  - TO DO
```
a. /summary/all 
Vraci vsechny objednavky daneho produktu/drinku pro vsechny drinky a jejich 
celkovy soucet: 
  i. Product 
  ii. Amount 
  iii. UnitPrice 
  iv. SummaryPrice


b. /summary/product
Vraci vsechny objednavky daneho drinku pro kazdy drink: 
  i. UserId 
  ii. Amount 
  iii. Price 
c. /summary/user 
Vraci vsechny objednavky daneho uzivatele pro vsechny uzivatele: 
  i. UserId 
  ii. Product 
  iii. Price 
```  
 
