const newPractFunction = (Name,Age,Address)=>{
    return {Name,Age,Address};

}

let a = newPractFunction('nischal',19,'someplace');
console.log(a.Age, a.Address,a.Name);