# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Buscador
Característica: Buscador de productos
  Yo como cliente del portal falabella.com.co
  Necesito realizar una busqueda de productos
  Para elegir los productos a comprar

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-001 # Buscar productos desde el buscador principal
  Esquema del escenario: lista de productos encontrados, al buscar productos, desde el portal
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra sobre el buscador de productos del portal falabella.com.co
      | confirma_mejor_oferta |
      | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando realiza la consulta del producto
      | producto_busqueda   | resultado_busqueda   |
      | <producto_busqueda> | <resultado_busqueda> |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería observarse el texto: "<resultado_final>" en los elementos: "busqueda"
    Ejemplos:
      | producto_busqueda | resultado_busqueda | resultado_final |
      | neveras           | neveras frost      | neveras frost   |
      | neveras           |                    | neveras         |

  @HP
  @Regresion
  @CP-002 # agregar articulo encontrado, al carrito
  Esquema del escenario: ver en resumen del carro, articulo agregado
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra sobre el listado de productos encontrados
      | confirma_mejor_oferta | producto_busqueda   | resultado_busqueda   |
      | Si                    | <producto_busqueda> | <resultado_busqueda> |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando agrega el articulo al carrito
      | nombre_articulo   |
      | <nombre_articulo> |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse exactamente: "Lo que llevas en tu Carro"
    Y debería observarse "VISIBLE"
      | nombre_texto_elemento     | parametros_texto_elemento |
      | resumen articulo agregado | <nombre_articulo>         |
    Ejemplos:
      | nombre_articulo                                        | producto_busqueda | resultado_busqueda |
      | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |
