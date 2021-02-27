// // Homework 1: arrays, functions and string prototype methods
//
// // don't change this array
// const carBrands = ['BMW', 'OPEL', 'AUDI', 'VOLKSWAGEN', 'FERRARI'];
//
// function getBrandFromArray(brandsArray, index) {
//     // TYPE YOUR CODE ONLY HERE
//     brandsArray.reverse();
//     return `Brand: ${brandsArray[index].toLowerCase()}`;
// }
//
// // EXPECTED RESULT (don't touch code below)
//
// const resultA = getBrandFromArray(carBrands, 0)
// console.log(resultA) // Brand: ferrari
//
// const resultB = getBrandFromArray(carBrands, 2)
// console.log(resultB) // Brand: audi
//
// const resultC = getBrandFromArray(carBrands, 4)
// console.log(resultC) // Brand: bmw



// // Homework 2: arrays, functions, closures
//
// // don't change this array
// const carBrands = ['BMW', 'OPEL', 'AUDI'];
//
// function makeBrandReturnFunction() {
//     // TYPE YOUR CODE ONLY HERE
//     let index = 0;
//     return function (){
//         const value = carBrands[index];
//         index++;
//         if (index === carBrands.length) index = 0;
//         return value;
//     }
// }
//
// // EXPECTED RESULT (don't touch code below)
//
// const getBrand = makeBrandReturnFunction();
// const resultA = getBrand()
// console.log(resultA) // BMW
//
// const resultB = getBrand()
// console.log(resultB) // OPEL
//
// const resultC = getBrand()
// console.log(resultC) // AUDI
//
// const resultD = getBrand()
// console.log(resultD) // BMW
//
// const resultE = getBrand()
// console.log(resultE) // OPEL



// // Homework 3: functions, objects, string prototype methods
//
// // don't change this object
// const user = {
//     firstName: 'Franklin',
//     lastName: 'White',
//     email: 'franklin.white@gmail.com',
// }
//
// function getUserDataStringByFormat(format) {
//     // TYPE YOUR CODE ONLY HERE
//     format = format.split(",").map(value => value.trim());
//     let data = "";
//     format.forEach(value => {
//         data += `${user[value]}, ` ;
//     })
//     return data.slice(0, -2);
// }
//
// // EXPECTED RESULT (don't touch code below)
//
// const resultA = getUserDataStringByFormat('firstName, email')
// console.log(resultA) // Franklin, franklin.white@gmail.com
//
// const resultB = getUserDataStringByFormat('firstName, lastName')
// console.log(resultB) // Franklin, White
//
// const resultC = getUserDataStringByFormat('email, firstName, lastName')
// console.log(resultC) // franklin.white@gmail.com, Franklin, White



// // Homework 4: functions, objects, Date
//
// // You have to create this function getObjectWithDate and it will return an object
//
//
// // TYPE YOUR CODE ONLY HERE
// const getObjectWithDate = (...rest) => {
//     const date = new Date();
//     const day = date.getDate() < 10 ? `0${date.getDate()}` : date.getDate();
//     const month = date.getMonth() < 9 ? `0${date.getMonth() + 1}` : date.getMonth() + 1;
//     const response = {
//         currentDay: `${day}/${month}`
//     }
//     for(let item of rest){
//         response[Object.keys(item)[0]] = Object.values(item)[0];
//     }
//     return response;
// }
//
// // EXPECTED RESULT (don't touch code below) You have to create this function getObjectWithDate and it will return an object
// const resultA = getObjectWithDate({ firstName: 'John' }, { phoneNumber: 189920001 })
// console.log(resultA) // { currentDay: '27/02', firstName: 'John', phoneNumber: 189920001 }
//
// const resultB = getObjectWithDate({ id: 9188 }, { firstName: 'Martin' }, { email: 'martin.112@gmail.com' })
// console.log(resultB) // { currentDay: '27/02', id: 9188, firstName: 'Martin', email: 'martin.112@gmail.com' }



// // Homework 5: objects
//
// const initData1 = { username: 'Hacker12', password: '*&3nasgss@b38s9' }
// const initData2 = { email: 'hacker12@mail.com', address: 'Petrushevycha 3, Lviv, Ukraine' }
//
// // You have to create variable with name compiledObject
//
// // TYPE YOUR CODE ONLY HERE
// const compiledObject = Object.assign({}, initData1, initData2);
// //другий варіант:
// const compiledObject2 = {...initData1, ...initData2};
//
//
// // EXPECTED RESULT (don't touch code below)
// console.log(compiledObject) // { username: 'Hacker12', email: 'hacker12@mail.com', address: 'Petrushevycha 3, Lviv, Ukraine' }



// // Homework 6: functions, Date, strings
//
// function getAgeUpToHours(birthdayDate) {
//     const today = new Date();
//     const years = today.getMonth() < birthdayDate.getMonth() ? today.getFullYear() - birthdayDate.getFullYear() - 1 : today.getFullYear() - birthdayDate.getFullYear();
//     const hoursNow = today.getHours();
//     const hoursOnBirsday = birthdayDate.getHours();
//     const hours = hoursOnBirsday > hoursNow ? 24 - (hoursOnBirsday - hoursNow) : hoursNow - hoursOnBirsday;
//     const days = Math.floor((today.getTime() - birthdayDate.setFullYear(today.getMonth() < birthdayDate.getMonth() ? today.getFullYear() - 1 : today.getFullYear())) / 1000 / 60 / 60 / 24);
//     return `${years} years, ${days} days, ${hours} hours`
// }
// //
// //
// // // EXPECTED RESULT
// console.log(getAgeUpToHours(new Date('March 15, 1997 21:15'))) // 23 years, 348 days, 23 hours
// console.log(getAgeUpToHours(new Date('April 24, 1998 22:00'))) // You can paste you birth date and look how old are you ;)



// // Homework 7: objects
//
// // don't change this object
// const initData = {
//     firstName: 'Franklin',
//     lastName: 'White',
//     email: 'franklin.white@gmail.com',
//     address: {
//         city: 'Lviv',
//         postalCode: 81000,
//     },
//     cars: [
//         {
//             brand: 'Mitsubishi',
//             plateNumber: 'BC0293AO'
//         },
//         {
//             brand: 'Toyota',
//             plateNumber: 'BC9932AI',
//             gear: {
//                 type: 'Automatic'
//             }
//         }
//     ]
// }
//
// // ADD ONLY ONE LINE OF CODE
// const {email, address: {postalCode}, cars: [{brand: firstCar, plateNumber: firstCarPlateNumber}, {gear: {type: secondCarGearType}}]} = initData;
//
// // EXPECTED RESULT
// console.log(email) // 'franklin.white@gmail.com'
// console.log(firstCar) // 'Mitsubishi'
// console.log(firstCarPlateNumber) // 'BC0293AO'
// console.log(postalCode) // 81000
// console.log(secondCarGearType) // 'Automatic'



// // Homework 8: objects, strings
//
// // don't change this object
// const initData = {
//     firstName: 'Franklin',
//     lastName: 'White',
//     postalCode: 81000,
//     email: 'franklin.white@gmail.com',
//     address: 'Lviv',
//     cars: []
// }
//
// function getUpperCasedObjectData() {
//     // ADD YOUR CODE HERE
//     const newData = {};
//     for (let key in initData){
//         newData[key] = typeof initData[key] === "string" ? initData[key].toUpperCase() : initData[key];
//     }
//     return newData;
// }
//
// // EXPECTED RESULT
// console.log(getUpperCasedObjectData())
// /*
// {
//   firstName: 'FRANKLIN',
//   lastName: 'WHITE',
//   postalCode: 81000,
//   email: 'FRANKLIN.WHITE@GMAIL.COM',
//   address: 'LVIV',
//   cars: []
// }
// */



// // Homework 9: SET, arrays, functions
//
// // don't change this array
// const initArray = ['Ivan', 'Ihor', 'Vasyl', 'Oleh', 'Vasyl', 'Petro', 'Ihor', 'Ihor', 'Petro'];
//
// function getUniqueArray(array) {
//     // ADD YOUR CODE HERE
//     return [...new Set(initArray)]
// }
//
// // EXPECTED RESULT
// console.log(getUniqueArray(initArray)) // ['Ivan', 'Ihor', 'Vasyl', 'Oleh', 'Petro']
