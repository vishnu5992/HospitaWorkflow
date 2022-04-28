import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { DoctorComponent } from './doctor/doctor.component';
import { PatientComponent } from './patient/patient.component';
import { PatienthomepageComponent } from './patienthomepage/patienthomepage.component';
import { DoctorhomepageComponent } from './doctorhomepage/doctorhomepage.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { CreatedoctorComponent } from './createdoctor/createdoctor.component';
import { DoctordashboardComponent } from './doctordashboard/doctordashboard.component';
import { PatientdashboardComponent } from './patientdashboard/patientdashboard.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CreateappoinmentComponent } from './createappoinment/createappoinment.component';
import { CreatefeedbackComponent } from './createfeedback/createfeedback.component';
import { PatientdetailsComponent } from './patientdetails/patientdetails.component';
import { AdminappoinmentdetailsComponent } from './adminappoinmentdetails/adminappoinmentdetails.component';
import { AdminfeedbackComponent } from './adminfeedback/adminfeedback.component';
import { AppoinmentstatusComponent } from './appoinmentstatus/appoinmentstatus.component';
import { HttpClientModule } from '@angular/common/http';
import { AppoinmentstatusforpatientComponent } from './appoinmentstatusforpatient/appoinmentstatusforpatient.component';
import { DoctorspecialityComponent } from './doctorspeciality/doctorspeciality.component';
import { AlldoctorsComponent } from './alldoctors/alldoctors.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AdminComponent,
    DoctorComponent,
    PatientComponent,
    PatienthomepageComponent,
    DoctorhomepageComponent,
    CreatepatientComponent,
    CreatedoctorComponent,
    DoctordashboardComponent,
    PatientdashboardComponent,
    AdmindashboardComponent,
    CreateappoinmentComponent,
    CreatefeedbackComponent,
    PatientdetailsComponent,
    AdminappoinmentdetailsComponent,
    AdminfeedbackComponent,
    AppoinmentstatusComponent,
    AppoinmentstatusforpatientComponent,
    DoctorspecialityComponent,
    AlldoctorsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
