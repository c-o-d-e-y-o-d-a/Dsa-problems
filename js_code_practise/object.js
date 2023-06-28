/*function Book(information){
    this.information = information;
    this.info=() =>{
        return this.information;
    }

}
const book1 = new Book('jdoifdosif');
console.log(book1.info());
console.log(Object.getPrototypeOf(book1)===Book.prototype);
console.log(book1.valueOf());*/
function Person(name) {
    this.name = name
  }
  
  Person.prototype.sayName = function() {
    console.log(`Hello, I'm ${this.name}!`)
  }
  
  function Player(name, marker) {
    this.name = name
    this.marker = marker
  }
  
  Player.prototype.getMarker = function() {
    console.log(`My marker is '${this.marker}'`)
  }
  
  // Object.getPrototypeOf(Player.prototype) should
  // return the value of "Person.prototype" instead
  // of "Object.prototype"
  Object.getPrototypeOf(Player.prototype) // returns Object.prototype
  
  // Now make `Player` objects inherit from `Person`
  Object.setPrototypeOf(Player.prototype, Person.prototype)
  Object.getPrototypeOf(Player.prototype) // returns Person.prototype
  
  const player1 = new Player('steve', 'X')
  const player2 = new Player('also steve', 'O')
  
  player1.sayName() // Hello, I'm steve!
  player2.sayName() // Hello, I'm also steve!
  
  player1.getMarker() // My marker is 'X'
  player2.getMarker() // My marker is 'O'