// // Homework 1: arrays, functions and string prototype methods
//
// // don't change this array
// const carBrands = ['BMW', 'OPEL', 'AUDI', 'VOLKSWAGEN', 'FERRARI'];
//
// function getBrandFromArray(brandsArray, index) {
//     // TYPE YOUR CODE ONLY HERE
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
// function getBrand() {
//     // TYPE YOUR CODE ONLY HERE
// }
//
// // EXPECTED RESULT (don't touch code below)
//
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
//
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
//
//
// // EXPECTED RESULT (don't touch code below)
// console.log(compiledObject) // { username: 'Hacker12', email: 'hacker12@mail.com', address: 'Petrushevycha 3, Lviv, Ukraine' }




// // Homework 6: functions, Date, strings
//
// function getAgeUpToHours(birthdayDate) {
//     // TYPE YOUR CODE ONLY HERE
// }
//
//
// // EXPECTED RESULT
// console.log(getAgeUpToHours(new Date('March 15, 1997 21:15'))) // 23 years, 348 days, 23 hours
// console.log(getAgeUpToHours(new Date(' paste your birth day here '))) // You can paste you birth date and look how old are you ;)






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
// }
//
// // EXPECTED RESULT
// console.log(getUniqueArray(initArray)) // ['Ivan', 'Ihor', 'Vasyl', 'Oleh', 'Petro']
