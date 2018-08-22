class Singleton:
    
    instancia = None
    
    def __init__(self):
        if Singleton.instancia != None:
            print("Esta clase es un Singleton. Ya existe un carro en el sistema.")
        else:
            Singleton.instancia = self
            
    @staticmethod
    def getInstance():
        if not Singleton.instancia:
            Singleton()
        return Singleton.instancia

carro1 = Singleton() 
print (carro1.getInstance)

carro2 = Singleton()
print (carro2.getInstance)

carro3 = Singleton()
print (carro3.getInstance) 
