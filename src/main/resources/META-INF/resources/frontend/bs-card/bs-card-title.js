
import { LitElement, html, css } from 'lit';
import { BsCardTitleCss } from './bs-card-title.css.js';

export class BsCardTitle extends LitElement {

    static get styles() {
        return [
            BsCardTitleCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-title"))
    window.customElements.define('bs-card-title', BsCardTitle);
