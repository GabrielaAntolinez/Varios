
import pygame,sys
from pygame.locals import *
#importar la clase jugador
from jugador import *
from disparo import *

class Adapter():
    _personajeTarget = None
    def __init__(self,personajeTarget):
        self._personajeTarget = personajeTarget
    
