
import { LitElement, html, css } from 'lit';
import { BsCardImgCss } from './bs-card-img.css.js';

export class BsCardImg extends LitElement {

    static get properties() {
        return {
            position: String
        };
    }

    static get styles() {
        return [
            BsCardImgCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-img"))
    window.customElements.define('bs-card-img', BsCardImg);
