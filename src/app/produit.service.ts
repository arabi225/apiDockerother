import { Injectable } from '@angular/core';


import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {

  readonly API_URL ="http://localhost:8080/produit";
  readonly ENDPOINT_PRODUIT= "/read";

  constructor(private httpClient: HttpClient) {
  }

  /*
  getProduit()  {
    return this.httpClient.get(this.API_URL+this.ENDPOINT_PRODUIT)
  }
  */

  getProduit(): Observable<any[]> {
    return this.httpClient.get<any[]>(this.API_URL + this.ENDPOINT_PRODUIT);

    
  }

  




}
