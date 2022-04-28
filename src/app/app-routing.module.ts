import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AdminappoinmentdetailsComponent } from './adminappoinmentdetails/adminappoinmentdetails.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminfeedbackComponent } from './adminfeedback/adminfeedback.component';
import { AlldoctorsComponent } from './alldoctors/alldoctors.component';
import { AppoinmentstatusComponent } from './appoinmentstatus/appoinmentstatus.component';
import { AppoinmentstatusforpatientComponent } from './appoinmentstatusforpatient/appoinmentstatusforpatient.component';
import { CreateappoinmentComponent } from './createappoinment/createappoinment.component';
import { CreatedoctorComponent } from './createdoctor/createdoctor.component';
import { CreatefeedbackComponent } from './createfeedback/createfeedback.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { DoctorComponent } from './doctor/doctor.component';
import { DoctordashboardComponent } from './doctordashboard/doctordashboard.component';
import { DoctorhomepageComponent } from './doctorhomepage/doctorhomepage.component';
import { DoctorspecialityComponent } from './doctorspeciality/doctorspeciality.component';
import { HomeComponent } from './home/home.component';
import { PatientComponent } from './patient/patient.component';
import { PatientdashboardComponent } from './patientdashboard/patientdashboard.component';
import { PatientdetailsComponent } from './patientdetails/patientdetails.component';
import { PatienthomepageComponent } from './patienthomepage/patienthomepage.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'admin',component:AdminComponent},
  {path:'doctor',component:DoctorComponent},
  {path:'patient',component:PatientComponent},
  {path:'patienthome',component:PatienthomepageComponent},
  {path:'doctorhome',component:DoctorhomepageComponent},
  {path:'createpatient',component:CreatepatientComponent},
  {path:'createdoctor',component:CreatedoctorComponent},
  {path:'doctordashboard',component:DoctordashboardComponent},
  {path:'patientdashboard',component:PatientdashboardComponent},
  {path:'admindashboard',component:AdmindashboardComponent},
  {path:'createappoinment',component:CreateappoinmentComponent},
  {path:'createfeedback',component:CreatefeedbackComponent},
  {path:'patientdetails',component:PatientdetailsComponent},
  {path:'adminappoinment',component:AdminappoinmentdetailsComponent},
  {path:'adminfeedback',component:AdminfeedbackComponent},
  {path:'appoinmentstatus',component:AppoinmentstatusComponent},
  {path:'appoimentstatusforpatient',component:AppoinmentstatusforpatientComponent},
  {path:'doctorspeciality',component:DoctorspecialityComponent},
  {path:'alldoctors',component:AlldoctorsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
