import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent implements OnInit {

  books:any;

      constructor(private service:BookService){ }

  ngOnInit()  {
    this.books=this.service.getBooks().subscribe(data=>this.books=data);
  }

}