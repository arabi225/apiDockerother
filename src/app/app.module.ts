import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { ProduitService } from './produit.service';

@NgModule({
  imports: [HttpClientModule],
  providers: [ProduitService],
})
export class AppModule { }
