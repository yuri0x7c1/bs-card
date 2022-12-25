
import { LitElement, html } from 'lit-element';
import { BsCardOverlayCss } from './bs-card-overlay.css.js';

export class BsCardOverlay extends LitElement {

    static get styles() {
        return [
            BsCardOverlayCss
        ];
    }

    render() {
        return html`
            <slot name="card-title"></slot>
            <slot name="card-subtitle"></slot>
            <slot name="card-text"></slot>
            <slot id="plainSlot"></slot>
            <slot name="card-links"></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-overlay"))
    window.customElements.define('bs-card-overlay', BsCardOverlay);



