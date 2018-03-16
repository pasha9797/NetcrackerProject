import {Component, OnInit} from '@angular/core';
import {UserService} from '../../user/user.service';
import {Router} from '@angular/router';
import {Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-header-authorized',
  templateUrl: './header-authorized.component.html',
  providers: []
})
export class HeaderAuthorizedComponent implements OnInit {


  constructor(private userService: UserService, private router: Router) {
  }

  ngOnInit() {

  }

  logout() {
    this.userService.logout().subscribe((obj: any) => {
      this.router.navigate(['/']);
    });

  }
}