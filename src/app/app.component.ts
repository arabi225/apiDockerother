import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProduitService } from "./produit.service";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ProduitService]
})
export class AppComponent implements OnInit {
  title = 'ApiFront';
  produits: any[] = [];
  constructor(private produitService: ProduitService){

  }

  ngOnInit() {
      console.log("on fais une initialisation ...")
      this.produitService.getProduit().subscribe(datas =>{
        this.produits = datas;
      });
  }
}
