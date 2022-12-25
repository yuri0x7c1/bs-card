
import { LitElement, html } from 'lit-element';
import { BsCardHeaderCss } from './bs-card-header.css.js';

export class BsCardHeader extends LitElement {

    static get styles() {
        return [
            BsCardHeaderCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-header"))
    window.customElements.define('bs-card-header', BsCardHeader);

