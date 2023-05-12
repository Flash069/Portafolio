import { Component } from '@angular/core';

@Component({
  selector: 'app-logo-ap',
  templateUrl: './logo-ap.component.html',
  styleUrls: ['./logo-ap.component.css']
})
export class LogoAPComponent implements OnInit {
  constructor(private router:Router){}
    ngOnInit(): void {}

ingreso(){
  this.router.navigate(['/ingreso'])
}

}
