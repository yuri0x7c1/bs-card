
import { LitElement, html } from 'lit';
import { BsCardFooterCss } from './bs-card-footer.css.js';

export class BsCardFooter extends LitElement {

    static get styles() {
        return [
            BsCardFooterCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-footer"))
    window.customElements.define('bs-card-footer', BsCardFooter);
