object Main {
   def main(args: Array[String]) {

     import Naval.{Point, Field, Ship, Fleet, Game}
     import Lesson.field

     //создание игрового поля
     var gameField: Field = Vector.fill(10)(Vector.fill(10)(false))

     //создание точки
     var myPoint: Point = new Point(0, 0)
     //создание корабля
     var myShip: Ship = List[Point](myPoint)
     //создание флота
     var gameFleet: Fleet = Map()
     //создание игры
     var game: Game = (gameField, gameFleet)

     def validateShip(ship: Ship): Boolean =
     /*
     определить, подходит ли корабль по своим характеристикам
         1. Нет изгибов
         2. Длина не более 4
     */
     {
       var result: Boolean = true
       val x1 = ship.head._1
       val y1 = ship.head._2

       ship.foreach
       {
         x =>
         {
           if (x._1 != x1 && x._2 != y1) {
             result = false
           }
         }
       }
       if (ship.length > 4) result = false
         println("validateShip: " + result)
       result

     }

     def validatePosition(ship: Ship, field: Field): Boolean =
     // определить, можно ли его поставить
     {
         var result: Boolean = true
         val size = ship.size - 1
         val sizeF = field.size - 1
         for(i <- 0 to size) {
             val x = ship.apply(i)._1
             val y = ship.apply(i)._2

             if (field.apply(x).apply(y)) {
                 result = false
                 println("0: " + result)
             }
             if (x - 1 >= 0){
                 if (field.apply(x - 1).apply(y)) {
                     result = false
                     println("1: " + result)
                 }
             }
             if (x - 1 >= 0 && y - 1 >= 0){
                 if (field.apply(x - 1).apply(y - 1)) {
                     result = false
                     println("2: " + result)
                 }
             }
             if (y - 1 >= 0){
                 if (field.apply(x).apply(y - 1)) {
                     result = false
                     println("3: " + result)
                 }
             }
             if (x + 1 <= sizeF && y - 1 >= 0){
                 if (field.apply(x + 1).apply(y - 1)) {
                     result = false
                     println("4: " + result)
                 }
             }
             if (x + 1 <= sizeF){
                 if (field.apply(x + 1).apply(y)) {
                     result = false
                     println("5: " + result)
                 }
             }
             if (x - 1 >= 0 && y + 1 <= sizeF){
                 if (field.apply(x - 1).apply(y + 1)) {
                     result = false
                     println("6: " + result)
                 }
             }
             if (y + 1 <= sizeF){
                 if (field.apply(x).apply(y + 1)) {
                     result = false
                     println("7: " + result)
                 }
             }
             if (x + 1 <= sizeF && y + 1 <= sizeF){
                 if (field.apply(x + 1).apply(y + 1)) {
                     result = false
                     println("8: " + result)
                 }
             }
         }
         println("validatePosition: " + result)
         result
     }

     def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet =
     // добавить корабль во флот
     {
         var result = fleet + (name -> ship)
         result
     }

     def markUsedCells(field: Field, ship: Ship): Field =
     // пометить клетки, которые занимает добавляемый корабль
     {
         var result: Field = field
         val size = ship.size - 1
         val sizeF = field.size - 1
         for(i <- 0 to size) {
             val x = ship.apply(i)._1
             val y = ship.apply(i)._2
             val q = result.apply(x).updated(y, true)
             result = result.updated(x, q)
         }
       result
     }

     def tryAddShip(game: Game, name: String, ship: Ship): Game =
     // добавление корабля в игру
     {
         //type Game = (Field, Fleet)
         var result = game
         var field = result._1
         var fleet = result._2

         //проверить ship на пригодность
         //проверить ship на возможность размещения
         if (validateShip(ship) && (validatePosition(ship, field))) {
             field = markUsedCells(field, ship)
             fleet = enrichFleet(fleet, name, ship)
             result = (field, fleet)
         }
         result
     }

     def inputAnalys(list: List[String], game: Game): Game =
     // обработка входных данных и создание исходного флота
     {
         var result =  game
         println("исходные данные")
         list.foreach(println)
         println()

       // обработка данных
         val countShip: Int = list.head.toInt
         var ships = list.tail
         for(i <- 1 to countShip) {
             val name = ships.head.split(" ").head
             val count = ships.head.split(" ").tail.head.toInt
             ships = ships.tail
             var ship: Ship = List[Point]()

             //добавление точек в корабль
             for(j <- 1 to count) {
                 val one = ships.head.split(" ").head.toInt
                 val two = ships.head.split(" ").tail.head.toInt
                 ships = ships.tail
                 var point: Point = new Point(one, two)
                 ship = ship :+ point
             }
             result = tryAddShip(result, name, ship)
             result._1.foreach(x => {
                 x.foreach(y => {
                     if (y) printf("%-2s", "X")
                     else printf("%-2s", "-")
                 })
                 println
             })
         }

         result
     }


     //программа
     //чтение данных из консоли
     val input = io.Source.stdin.mkString.split("\n").toList
     //обработка входных данных, создание флота
     game = inputAnalys(input,game)
     println
     println("gameFleet: ")
     if (game._2.size > 0){
            game._2.keys.foreach(println)
        }

   }
}

 /*
 type Point = (Int, Int) 				//клетка
 type Field = Vector[Vector[Boolean]] 	//игровое поле
 type Ship = List[Point]					//корабль
 type Fleet = Map[String, Ship]			//флот, все корабли
 type Game = (Field, Fleet)				//игра
 */
