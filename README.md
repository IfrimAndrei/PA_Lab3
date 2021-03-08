# PA_Lab3
Am facut Partea de Compulsory si cea de Optional
Toate clasele cerute sunt implementate dupa cerinte (si dupa exemplele din slide-uri):
  -Clasa abstracta Location
  -Interfete Classifiable, Payable, Visitable
  -Clasele Church, Hotel, Museum, Restaurant: extinderi la Location care implementeaza 1-3 interfete
  -Clasa City in care se retin locatiile intr-o lista
  -Clasa TravelPlan in care retin datele problemei si in care am metoda de rezolvare
  -Clasa Main in care se executa TravelPlan;
Pentru ultimul punct din Optional am folosit Dijkstra, am luat in considerare si preferintele, acesta ar trebui puse ca o matrice de tip int, cu cat numarul
este mai mare cu atat e mai de preferat drumul acela, se ia in considerare preferinta cand este vorba de egalitate intre drumuri( v[i][j] == v[i][k] + v[k][j] )

