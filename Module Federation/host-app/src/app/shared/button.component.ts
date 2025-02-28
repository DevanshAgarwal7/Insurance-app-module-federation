import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss']
})
export class ButtonComponent {
  @Output() buttonClicked = new EventEmitter<void>();
  @Input() buttonText: string = "Select";

  handleClick() {
    this.buttonClicked.emit();
  }
}
