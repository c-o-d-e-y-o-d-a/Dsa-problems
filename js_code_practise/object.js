function Book(information){
    this.information = information;
    this.info=() =>{
        return this.information;
    }

}
const book1 = new Book('jdoifdosif');
console.log(book1.info());