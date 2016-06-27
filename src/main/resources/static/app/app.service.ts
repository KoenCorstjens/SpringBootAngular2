import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/add/operator/map'
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AppService {
    private headers:Headers;

    constructor(private _http:Http) {
        this.headers = new Headers();
        this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json');
        this.setCsrf();
    }

    getCsrf = ():Observable<Response> => {
        return this._http.get('/csrf').map(res => res.json());
    };

    setCsrf() {
        this.getCsrf().subscribe((data) => this.headers.append(data.headerName,data.token) ,
            error => console.log(error),
            () => console.log('Get all parameters complete'));
    };
    logout() {
        return this._http.post('/logout',null,{
            headers: this.headers
        }) 
    }

}
