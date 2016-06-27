"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var http_1 = require('@angular/http');
require('rxjs/add/operator/map');
var AppService = (function () {
    function AppService(_http) {
        var _this = this;
        this._http = _http;
        this.getCsrf = function () {
            return _this._http.get('/csrf').map(function (res) { return res.json(); });
        };
        this.headers = new http_1.Headers();
        this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json');
        this.setCsrf();
    }
    AppService.prototype.setCsrf = function () {
        var _this = this;
        this.getCsrf().subscribe(function (data) { return _this.headers.append(data.headerName, data.token); }, function (error) { return console.log(error); }, function () { return console.log('Get all parameters complete'); });
    };
    ;
    AppService.prototype.logout = function () {
        return this._http.post('/logout', null, {
            headers: this.headers
        });
    };
    AppService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_1.Http])
    ], AppService);
    return AppService;
}());
exports.AppService = AppService;
//# sourceMappingURL=app.service.js.map