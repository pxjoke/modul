parker
Pen{type=BALLPOIN, rodThickness=0.6, rodLength=12.0, manufacturer='parker', name='vector', id=123456}
parker2
Pen{type=BALLPOIN, rodThickness=0.6, rodLength=12.0, manufacturer='parker', name='vector', id=123456}
parker.hashCode() = 1807618935
parker2.hashCode() = 1807618935
parker.equals(parker) = true
parker.equals(parker2) = true
parker2.equals(parker) = true
parker == parker2 : false
parker2.setId(123)
parker.hashCode() = 1807618935
parker2.hashCode() = 1807495602
parker.equals(parker) = true
parker.equals(parker2) = false
parker2.equals(parker) = false
parker == parker2 : false
false
tukzar:
Pen{type=GEL, rodThickness=0.56, rodLength=11.53, manufacturer='tukzar', name='rs5000', id=1286}
tukzar.hashCode() = -1142386733
tukzar.equals(parker) = false
parker.equals(tukzar) = false