# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Compra
@CarritoCompra
Característica: Detalle carrito compra
  Yo como cliente de falabella
  Necesito ver el detalle de los articulos adicionados al carrito
  Para proseguir con la compra

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-003 # Detalle carrito de compra
  Esquema del escenario: Se listan detalle de articulos, seleccionados para compra
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra especificando las unidades de compra del articulo seleccionado
      | nombre_articulo   | producto_busqueda   | resultado_busqueda   | confirma_mejor_oferta |
      | <nombre_articulo> | <producto_busqueda> | <resultado_busqueda> | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando se dirige al carrito
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse: "Resumen de la orden"
    Y debería observarse el estado de los elementos
      | estado_elemento | nombre_estado_elemento | parametros_estado_elemento |
      | VISIBLE         | producto seleccionado  | <nombre_articulo>          |
    Ejemplos:
      | nombre_articulo                                        | producto_busqueda | resultado_busqueda |
      | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |


