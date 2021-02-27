// // - Числа від 1 до 100 лежать в масиві, вони хаотично перемішані, звідти вилучили одне число, треба знайти, що це за число
// // підготовка масиву для задачі

// const numbers = [];
// for (let i = 1; i <= 100; i++){
//     numbers.push(i);
// }
// numbers.reverse();
// numbers.splice(Math.round(Math.random() * 100), 1);
//
// //пошук числа
//
// function findNumber(arr){
//     arr.sort((a,b) => a - b);
//     let findedNumber = "All right";
//     arr.forEach((value, index, array) => {
//         const nextValue = array[index + 1];
//         if (nextValue && nextValue - value > 1) findedNumber = ++value;
//     })
//     return findedNumber;
// }
//
// console.log(findNumber(numbers));




//// -Вивести всі прості числа (діляться тільки на себе і на 1), від k до n (k ... n)
//
// function showAllSimpleNumbers(k, n){
//     let numbers = [];
//     for(let i = k; i <= n; i++){
//         numbers.push(i)
//     }
//     function isNumberSimple(number){
//         if (number < 2) return false;
//         if (number === 2) return true;
//         for (let i = 2; i < number; i++){
//             if(number % i === 0) return false;
//         }
//         return true;
//     }
//     numbers = numbers.filter(value => isNumberSimple(value));
//     return numbers;
// }
//
// console.log(showAllSimpleNumbers(0, 100));





// // Об"єкти :
// // Зробити з масива об"єкт
// // на вході масив

// var arr = [
//     {name: 'width', value: 10},
//     {name: 'height', value: 20}
// ];

// // на виході об"єкт
// // {width: 10, height: 20}

// function objFromArr(array){
//     const obj = {};
//     array.forEach(value => {
//         obj[value.name] = value.value;
//     })
//     return obj;
// }
//
// console.log(objFromArr(arr));
