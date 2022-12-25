
import { LitElement, html } from 'lit-element';
import { BsCardSubtitleCss } from './bs-card-subtitle.css.js';

export class BsCardSubtitle extends LitElement {

    static get styles() {
        return [
            BsCardSubtitleCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-subtitle"))
    window.customElements.define('bs-card-subtitle', BsCardSubtitle);


