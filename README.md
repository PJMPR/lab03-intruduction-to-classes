# Zadanie

Twoja firma dostała zlecenie na stworzenie oprogramowania dla dużego sklepu
internetowego „JavaMarkt”. Jedną z podstawowych funkcjonalności będzie
oprogramowanie koszyka zakupów, który potrafiłby uwzględniać różne promocje, rabaty
oraz oferty specjalne, takie jak:

* Jeśli wartość zamówienia jest większa niż np. 300 zł klient otrzymuje 5% zniżki na zakupione towary
* "3 w cenie 2" - Jeśli klient kupi conajmniej 3 produkty to 3 najtańszy otrzymuje gratis
* Jeśli wartość zamówienia przekracza wartość 200 zł klient otrzymuje firmowy
kubek gratis

Towary w koszyku powinny być posegregowane malejąco według ceny, a potem według
kolejności alfabetycznej nazw produktów.

Twoim zadaniem jest zaimplementowanie logiki, operującej na obiektach typu ‘Product’,
która umożliwiałaby: 

1. Wyszukiwanie najtańszego/najdroższego produktu w zadanej kolekcji produktów
2. Wyszukiwanie n najtańszych/najdrożyszych produktów w zadanej kolekcji
produktów
3. Sortowanie kolekcji produktów po cenie jak i po nazwie
4. Wyliczanie sumy cen wszystkich zadanych produktów
5. Wyświetlanie w konsoli informacje o wszystkich produktach w zadanej kolekcji
produktów
6. Aplikowanie opisanych powyżej rodzajów promocji na zadanej kolekcji produktów 

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/Zingam/Markdown-Document-UML-Use-Test/master/UML/Instance.puml)
