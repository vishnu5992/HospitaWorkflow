export class Appoinment{
    DoctorName:any;
    PatientName:any;
    Description!:any;
    Date!:any;
    constructor(DoctorName:any,PatientName:any,Description:any,Date:any){
      this.DoctorName = DoctorName;
      this.PatientName= PatientName;
      this.Description= Description;
      this.Date= Date;
    }
}