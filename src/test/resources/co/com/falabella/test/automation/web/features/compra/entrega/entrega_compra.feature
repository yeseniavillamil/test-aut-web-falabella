# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Compra
@EntregaCompra
Característica: Entrega de compra
  Yo como cliente de falabella
  Necesito especificar mis datos de contacto y domicilio
  Para programar la entrega de mis articulos

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta de gestion de pruebas (TestRail / XRay ...)
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-004 # Ver proceso de entrega
  Esquema del escenario: Inicia proceso de entrega, al continuar con la compra, desde el carrito
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra sobre el listado de articulos seleccionados
      | nombre_articulo   | producto_busqueda   | resultado_busqueda   | confirma_mejor_oferta |
      | <nombre_articulo> | <producto_busqueda> | <resultado_busqueda> | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando inicia con el proceso de compra
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse: "Compra más rápido y fácil"
    Ejemplos:
      | nombre_articulo                                        | producto_busqueda | resultado_busqueda |
      | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |


  @HP
  @Regresion
  @CP-005 # Ver proceso de entrega - domicilio
  Esquema del escenario: Ir a informacion de domicilio, al confirmar informacion de contacto
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra especificando su información de contacto
      | nombre_articulo   | producto_busqueda   | resultado_busqueda   | confirma_mejor_oferta |
      | <nombre_articulo> | <producto_busqueda> | <resultado_busqueda> | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando confirma su información de contacto
      | correo_contacto   |
      | <correo_contacto> |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse: "Ingresa tu dirección"
    Ejemplos:
      | correo_contacto    | nombre_articulo                                        | producto_busqueda | resultado_busqueda |
      | hcuenca8@gmail.com | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | hcuenca8@gmail.com | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |


  @HP
  @Regresion
  @CP-006 # Ver proceso de entrega - tipo de entrega
  Esquema del escenario: Ir a tipo de entrega, al confirmar información de contacto
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra especificando sus información de domicilio
      | correo_contacto   | nombre_articulo   | producto_busqueda   | resultado_busqueda   | confirma_mejor_oferta |
      | <correo_contacto> | <nombre_articulo> | <producto_busqueda> | <resultado_busqueda> | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando confirma su información de domicilio
      | departamento_domicilio   | ciudad_domicilio   | barrio_domicilio   | direccion_domicilio   | adicional_domicilio   |
      | <departamento_domicilio> | <ciudad_domicilio> | <barrio_domicilio> | <direccion_domicilio> | <adicional_domicilio> |
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse: "Elige un tipo de entrega"
    Ejemplos:
      | correo_contacto    | departamento_domicilio | ciudad_domicilio | barrio_domicilio | direccion_domicilio | adicional_domicilio                   | nombre_articulo                                        | producto_busqueda | resultado_busqueda |
      | hcuenca8@gmail.com | VALLE DEL CAUCA        | CALI             | CALI             | Cr 98 # 48-38       | apto 728 torre 4, Conjunto San Rafael | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | hcuenca8@gmail.com | VALLE DEL CAUCA        | CALI             | CALI             | Cr 98 # 48-38       | apto 728 torre 4, Conjunto San Rafael | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |

  @HP
  @Regresion
  @CP-007 # Ver proceso Pago
  Esquema del escenario: Ir a proceso de pago, al completar proceso de entrega
      # R/ ¿Donde se encuentra el actor? --> ubicación / contexto
      # R/ ¿Que acabó de realizar el actor? --> previamente, en tiempo pasado
    Dado que "el cliente" se encuentra finalizando el proceso de entrega
      | departamento_domicilio   | ciudad_domicilio   | barrio_domicilio   | direccion_domicilio   | adicional_domicilio   | correo_contacto   | nombre_articulo   | producto_busqueda   | resultado_busqueda   | confirma_mejor_oferta |
      | <departamento_domicilio> | <ciudad_domicilio> | <barrio_domicilio> | <direccion_domicilio> | <adicional_domicilio> | <correo_contacto> | <nombre_articulo> | <producto_busqueda> | <resultado_busqueda> | Si                    |
      # R/ ¿Que esta haciendo el actor? --> en tiempo presente, comportamiento sujeto de prueba
    Cuando completa el proceso de entrega
      # R/ ¿Que se espera? --> en tiempo futuro, validación / verificación
      # R/ ¿Cual es la consecuencia de sus actos? --> en tiempo futuro, lo que sucederá
    Entonces debería presentarse: "Agregar tarjeta"
    Ejemplos:
      | correo_contacto    | departamento_domicilio | ciudad_domicilio | barrio_domicilio | direccion_domicilio | adicional_domicilio                   | nombre_articulo                                | producto_busqueda | resultado_busqueda |
      | hcuenca8@gmail.com | VALLE DEL CAUCA        | CALI             | CALI             | Cr 98 # 48-38       | apto 728 torre 4, Conjunto San Rafael | Minibar Challenger Ref.CR121  121L - Titanium.         | neveras           |                    |
      | hcuenca8@gmail.com | VALLE DEL CAUCA        | CALI             | CALI             | Cr 98 # 48-38       | apto 728 torre 4, Conjunto San Rafael | Nevera Haceb No Frost 310 Litros Manija Externa Niebla | neveras           |                    |








