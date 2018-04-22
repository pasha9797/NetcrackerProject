/**
 * Класс пользователя на frontend
 */
export class User {

  public firstName: string;
  public lastName: string;
  public birthday: string;
  public email: string;
  public password: string;
  public registrationDate: string;

  constructor(firstName: string, lastName: string, birthday: string, email: string, password: string, registrationDate: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.email = email;
    this.password = password;
    this.registrationDate = registrationDate;
  }

}