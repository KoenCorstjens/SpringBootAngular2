import { Component } from '@angular/core';
import { AppService} from './app.service';

@Component({
    selector: 'my-app',
    template: '<h1>My First Angular 2 App</h1> <button (click)="logout()" >logout</button>',
    providers: [AppService],
})
export class AppComponent {

    constructor(private service:AppService) {

    }

    logout(){
        this.service.logout().subscribe($location.path("/"));
    }
}
