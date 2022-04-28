import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adminfeedback',
  templateUrl: './adminfeedback.component.html',
  styleUrls: ['./adminfeedback.component.css']
})
export class AdminfeedbackComponent implements OnInit {
  patientFeedback:any=null;

  constructor() { }

  ngOnInit(): void {
    const feedbackdetail = localStorage.getItem('check');
    if (feedbackdetail) {
      this.patientFeedback = JSON.parse(feedbackdetail);
      console.log(this.patientFeedback);
    }
  }

}
